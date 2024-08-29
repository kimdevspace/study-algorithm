/*
시뮬레이션 및 빡구현은 자료구조 정하는게 중요해보임.
차량 정비소 문제에서는 대기열을 큐로, 창구를 배열로.
창구의 처리시간을 확인할 배열도 하나 만들기

고객 정보에는 고객 번호, 고객이 머문 창구번호, 창구에 고객이 머문시간
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {

    static class Person {
        int clientNumber;
        int receptionNumber;
        int repairNumber;
        int stayTimeReception;
        int stayTimeRepair;

        public Person(int clientNumber, int receptionNumber, int repairNumber, int stayTimeReception, int stayTimeRepair) {
            this.clientNumber = clientNumber;
            this.receptionNumber = receptionNumber;
            this.repairNumber = repairNumber;
            this.stayTimeReception = stayTimeReception;
            this.stayTimeRepair = stayTimeRepair;
        }
    }

    private static int T, N, M, K, A, B;
    private static int[] arr_A, arr_B, arr_T;
    private static Queue<Person> waitingReception;
    private static Queue<Person> waitingRepair;
    private static List<Person> complete;
    private static Person[] reception;
    private static Person[] repair;
    private static int ans;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());

            waitingReception = new LinkedList<>();
            waitingRepair = new LinkedList<>();
            complete = new ArrayList<>();
            reception = new Person[N + 1];
            repair = new Person[M + 1];

            //접수창구 정보
            arr_A = new int[N + 1];
            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= N; i++) {
                arr_A[i] = Integer.parseInt(st.nextToken());
            }

            //정비창구 정보
            arr_B = new int[M + 1];
            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= M; i++) {
                arr_B[i] = Integer.parseInt(st.nextToken());
            }

            //순서 정보!
            arr_T = new int[K + 1];
            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= K; i++) {
                arr_T[i] = Integer.parseInt(st.nextToken());
            }

            int time = 0;
            while (true) {
                if (complete.size() == K) {
                    break;
                }

                //먼저 온 순서대로 접수창구 대기열에 넣기
                for (int i = 1; i <= K; i++) {
                    if (arr_T[i] == time) {
                        waitingReception.offer(new Person(i, -1, -1, 0, 0));
                    }
                }

                //접수 창구 대기열에서 접수창구로 이동
                for (int i = 1; i <= N; i++) {
                    // 이동 조건은 접수창구가 비어있어야 하고 대기열에 존재할 때!
                    if (reception[i] == null && !waitingReception.isEmpty()) {
                        reception[i] = waitingReception.poll();
                        reception[i].receptionNumber = i;
                    }
                }

                //접수창구 머문 시간 계산
                for (int i = 1; i <= N; i++) {
                    if (reception[i] != null) {
                        reception[i].stayTimeReception++;
                    }
                }

                //접수창구에서 정비창구 대기열로!
                for (int i = 1; i <= N; i++) {
                    //이동 조건은 머문 시간이 처리 시간과 같아지면!
                    if (reception[i] != null && reception[i].stayTimeReception == arr_A[i]) {
                        waitingRepair.offer(reception[i]);
                        reception[i] = null;
                    }
                }

                //정비창구 대기열에서 정비 창구로
                for (int i = 1; i <= M; i++) {
                    //이동 조건은 정비 창구가 비어있고 대기열에 존재할 때
                    if (repair[i] == null && !waitingRepair.isEmpty()) {
                        repair[i] = waitingRepair.poll();
                        repair[i].repairNumber = i;
                    }
                }

                //정비창구에서 머문 시간 계산
                for (int i = 1; i <= M; i++) {
                    if (repair[i] != null) {
                        repair[i].stayTimeRepair++;
                    }
                }

                for (int i = 1; i <= M; i++) {
                    if (repair[i] != null && repair[i].stayTimeRepair == arr_B[i]) {
                        complete.add(repair[i]);
                        repair[i] = null;
                    }
                }
                time++;
            }
            ans = 0;
            for (Person person : complete) {
                if (person.receptionNumber == A && person.repairNumber == B) {
                    ans += person.clientNumber;
                }
            }

            if (ans == 0) {
                ans = -1;
            }
            System.out.println("#" + tc + " " + ans);
        }
    }
}