
public class test {

        static void mostRecentlyUsedApps(int arr[], int N, int K)
        {
            int app_index = 0;
            app_index = (K % N);

            int x = app_index, app_id = arr[app_index];
            while (x > 0)
            {
                arr[x] = arr[--x];
            }

            arr[0] = app_id;
        }

        static void printArray(int arr[], int N)
        {
            for (int i = 0; i < N; i++)
                 System.out.println(arr[i]+" ");
        }

        // Driver code
        public static void main(String[] args)
        {
            int K = 3;
            int arr[] = { 1,2,3,4 };
            int N = 4;

            mostRecentlyUsedApps(arr, N, K);
            printArray(arr, N);
        }
    }





