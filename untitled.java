public class Main{
	public static void main(String[] args){

	}

	public static int calSubStringNum(String str) {
		if(str == null || str.length() == 0)
			return null;
		int result = 0;
		result ++;
		ArrayList<String> list = new ArrayList();
		String tmp = str.charAt(0) + "";
		list.add(tmp);
		for (int i = 1; i < str.length(); i++) {
			if(str.charAt(i) == str.charAt(i-1)){
				tmp = tmp + str.charAt(i);
				if(!list.contains(tmp)){
					list.add(tmp);
					result++;
				}
			}else{
				tmp = str.charAt(i)+"";
			}
		}
		return result;
	}
}