import java.util.*;
public class SaraPhone {
    public static int minimumAppsToDelete(int N, int K, int M) {
        int[] apps = new int[N];
        int totalMemory = 0;

        // Calculate the total memory occupied by all apps
        for (int i = 0; i < N; i++) {
            apps[i] = K;
            totalMemory += apps[i];
        }

        // Check if it is possible to release M units of memory
        if (totalMemory <= M) {
            return -1;
        }

        // Sort the apps array in descending order
        Arrays.sort(apps);

        int deletedApps = 0;
        int i = N - 1;

        // Delete apps until the total memory is less than or equal to M
        while (totalMemory > M && i >= 0) {
            totalMemory -= apps[i];
            deletedApps++;
            i--;
        }

        return deletedApps;
    }

    public static void main(String[] args) {
        int N = 10;
        int K = 3;
        int M = 10;
        int result = minimumAppsToDelete(N, K, M);
        System.out.println(result);

        N = 10;
        K = 3;
        M = 40;
        result = minimumAppsToDelete(N, K, M);
        System.out.println(result);
    }
}

//Question:
//        Sara's Phone (Functional Problem)
//        Time Limit: 2 sec
//        Memory Limit: 128000 kB
//        Problem Statement
//        Sara's Phone has N apps and each app takes K unit of memory. Now Sara wants to release M units of memory. Your task is to tell the minimum apps Sara needs to delete or say it is not possible.
//        Input
//        User Task:
//        Since this will be a functional problem, you don't have to take input. You just have to complete the function Phone() that takes integers N, K, and M as arguments.
//
//        Constraints:-
//        1 <= N <= 1000
//        1 <= K <= 100
//        0 <= M <= 10000
//        Output
//        Return minimum apps to delete and if it is not possible return -1.
//        Example
//        Sample Input:-
//        10 3 10
//
//        Sample Output:-
//        4
//
//        Sample Input:-
//        10 3 40
//
//        Sample Output:-
//        -1
