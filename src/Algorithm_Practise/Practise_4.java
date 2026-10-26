package Algorithm_Practise;

import java.util.Random;
/*学校选举学生会主席，有5个候选人
全校1000名同学参与投票（每人一票，可以弃权，或者选1-5号）。
投票使用Random模拟。0：弃权，1～5：给对应的候选人投票
要求1：
　　统计每个候选人的得票数和得票率，找出得票最多的候选人？
要求2：
　　统计弃票数和弃票率是多少？ */
public class  Practise_4 {
    static void main() {
        int result [] = randomResult(1000);
        for (int i = 1; i < result.length; i++) {
            System.out.printf("%d号候选人: %d票, 得票率 %.2f%%%n", i, result[i], result[i] * 100.0 / 1000);
        }
        int WinnerVotes = findMax(result ,6);
        for (int p = 1; p < result.length; p++) {
            if (result[p] == WinnerVotes ) {
                System.out.println("The candidate who win the most votes is: " + p);
        }
        }
        double votesRate =  (WinnerVotes * 100.0) / 1000 ;
        System.out.printf("Winner Votes:%d\n" + "VotesRate: %.2f%%" , WinnerVotes, votesRate);
        }


    public static int[] randomResult(int votes) {    /*模拟投票*/
        int arr[] = new int [6];
        Random rd = new Random();
        for (int i = 0; i < votes; i++) {
            int index = rd.nextInt(0, 6);
            arr[index]++;
        }
        return arr;


        }
            public static int findMax(int[] arr, int length) {
                int Max = arr[1];
                for (int i = 1; i < length; i++) {
                    if (arr[i] > Max) {
                        Max = arr[i];
                    }
                }
                return Max;
            }

        }
