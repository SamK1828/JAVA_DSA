package Arrays.Medium;

class MajorityElement {

    public static int majorityElement(int[] v) {
        // size of the given array:
        int n = v.length; //array length
        int cnt = 0; // count
        int el = 0; // Element

        // applying the algorithm:
        for (int i = 0; i < n; i++) {
            if (cnt == 0) 
            {
                cnt = 1;
                el = v[i]; //consider it as majority 
            } 
            else if (el == v[i])  //if element is present count ++ , if not , count --
                cnt++;
            else
                cnt--;
            //if count gets 0 , new majority will be assigned 
        }

        // checking if the stored element
        // is the majority element:
        
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] == el)
                cnt1++;
        }

        if (cnt1 > (n / 2))
            return el;
        return -1;
    }

    public static void main(String args[]) {
        int[] arr = { 2, 2, 1, 1, 1, 2, 2 };
        int ans = majorityElement(arr);
        System.out.println("The majority element is: " + ans);

    }
    //Above Algorithm is also known as Moore's Voting Algorithm...... 
}
