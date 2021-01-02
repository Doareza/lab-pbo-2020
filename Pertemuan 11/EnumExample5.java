class EnumExample5{
 enum Day{ SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,
SATURDAY}
 public static void main(String args[]){
    Day day=Day.MONDAY;
    switch(day){
  case SUNDAY: System.out.println("sunday");
    break;
  case MONDAY: System.out.println("monday");
    break;
  default: 
    System.out.println("other day");
    }
 }
} 
    
/**
	Outputnya berupa:
	monday

	jadi, dalam enum dapat diterapkan konsep switch case dimana dalam kasus ini
	parameter dalam switchnya berupa "MONDAY" sehingga hasil outputnya adalah monday
	sesuai dengan kode program di atas
*/    