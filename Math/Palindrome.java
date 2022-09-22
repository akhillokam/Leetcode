//TC - theta(no.of digits)
boolean isPal(int n){
	int rev = 0;
	int temp = n;
	while(temp != 0){
		ld = temp%10;
		rev = rev*10 + ld;
		temp = temp/10;
	}
	return (temp == rev);
}