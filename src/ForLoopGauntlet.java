
public class ForLoopGauntlet {
public static void main(String[] args) {
for (int i = 0; i < 101; i++) {
	System.out.println(i);
}
for(int i=100; i>0;i--){
	System.out.println(i);
}
for(int i=2;i<102; i+=2){
	System.out.println(i);
}
for(int i=1;i<101; i+=2){
	System.out.println(i);
}
for(int i=1; i<501; i++){
	System.out.print(i);
	if(i% 2 == 0){
	System.out.println (" even ");
	}
	else if(i% 2==1){
		System.out.println (" odd ");
	}
	}

	for(int i=0;i<784;i+=7){
System.out.println(i);
	}
	int age= 0;
	for(int i=2002;i<2017;i++){
		System.out.println("In"+i+" I was "+age+ "years old.");
		age++;
	}
	for(int i=0; i<3;i++){
	for (int j = 0; j < 3; j++) {
	System.out.println(i+""+j);	
		}
	}
	for(int i=1;i<10;i++){
	System.out.print(i);
	if(i%3==0){
		System.out.println();
	}
		}	
	
}
}




