package leetcode;

public class demo {

	public static void main(String x[]) {
		StringBuilder sb = new StringBuilder();

		String str = "ka29p3d7e45";
		boolean flag = false;
		for (char i = 0; i < str.length() - 1; i++) {
			char ch = str.charAt(i);

			if ((int) ch >= 48 && 57 >= (int) ch) {
				sb.append(ch);
				flag = true;
			} else if (flag) {
				sb.append(" ");
				flag = false;
			}
		}
		System.out.println(sb + "\n");
		String st = sb.toString();
		String arr[] = st.split(" ");

		for (int i = 0; i < arr.length; i++) {
			int a = Integer.parseInt(arr[i]);
			boolean check = true;
			for (int j = 2; j <= a / 2; j++) {
				if (a % j == 0) {
					check = false;
					break;
				}
			}
			if (check)
				System.out.println(a);
		}

	}
}
