public int missNum(int[] array){
	if(array==null||array.length==0)
		return -1;
	int len = array.length;
	int geted = 0;
	int getting = len;
	while(geted<getting){
		if(array[geted]==geted+1)
			geted++;
		else if(array[geted]<=1||array[geted]>=getting||array[geted]==array[array[geted]-1]){
			array[geted] = array[--getting];
		}else{
			swap(array,geted,array[geted]-1);
		}
	}
}