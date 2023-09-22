public class toggle {
    public static void main(String args[]) {
        int n = 10;
        boolean switches[] = new boolean[n + 1];
        int oncount = 0;
        int offcount = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j += i) {
                switches[j] = !switches[j]; // Toggle the switch
            }
        }

        for (int k = 1; k <= n; k++) {
            if (switches[k]) {
                oncount++;
            } else {
                offcount++;
            }
        }

        System.out.println("Number of switches in 'on' position: " + oncount);
        System.out.println("Number of switches in 'off' position: " + offcount);
    }
}
