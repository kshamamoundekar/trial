package star;

public class starpatterns {
	int space1;
	int star1;
	int space2;
	int space3;
	public static void main(String[] args) {
		starpatterns x=new starpatterns();
	x.space1=6;
	x.star1=3;
	x.space2=0;
	x.space3=12;
	
	for(int line=1;line<=43;line++) {
		for(int spaceA=1;spaceA<=x.space1;spaceA++) {
			System.out.print(" ");}
		for(int starA=1;starA<=x.star1;starA++) {
			System.out.print("*");}
		for(int spaceB=1;spaceB<=x.space2;spaceB++) {
			System.out.print(" ");}
		for(int starB=1;starB<=x.star1;starB++) {
			System.out.print("*");}
		for(int spaceC=1;spaceC<=x.space3;spaceC++) {
			System.out.print(" ");}
		for(int starA=1;starA<=x.star1;starA++) {
				System.out.print("*");}
		for(int spaceB=1;spaceB<=x.space2;spaceB++) {
			System.out.print(" ");}
		for(int starA=1;starA<=x.star1;starA++) {
			System.out.print("*");}
		for(int spaceC=1;spaceC<=x.space3;spaceC++) {
			System.out.print(" ");}
		for(int starA=1;starA<=x.star1;starA++) {
				System.out.print("*");}
		for(int spaceB=1;spaceB<=x.space2;spaceB++) {
			System.out.print(" ");}
		for(int starB=1;starB<=x.star1;starB++) {
			System.out.print("*");}
		for(int spaceC=1;spaceC<=x.space3;spaceC++) {
			System.out.print(" ");}
		for(int starA=1;starA<=x.star1;starA++) {
				System.out.print("*");}
		for(int spaceB=1;spaceB<=x.space2;spaceB++) {
			System.out.print(" ");}
		for(int starB=1;starB<=x.star1;starB++) {
			System.out.print("*");}
		for(int spaceC=1;spaceC<=x.space3;spaceC++) {
			System.out.print(" ");}
		for(int starA=1;starA<=x.star1;starA++) {
				System.out.print("*");}
		for(int spaceB=1;spaceB<=x.space2;spaceB++) {
			System.out.print(" ");}
		for(int starB=1;starB<=x.star1;starB++) {
			System.out.print("*");}
		for(int spaceC=1;spaceC<=x.space3;spaceC++) {
			System.out.print(" ");}
		for(int starA=1;starA<=x.star1;starA++) {
				System.out.print("*");}
		for(int spaceB=1;spaceB<=x.space2;spaceB++) {
			System.out.print(" ");}
		for(int starB=1;starB<=x.star1;starB++) {
			System.out.print("*");}
		
		
	System.out.println();
	if(line<=6) {
		x.space1--;
		x.space2=x.space2+2;
		x.space3=x.space3-2;}
	else if(line<=12) {
		x.space1++;
		x.space2=x.space2-2;
		x.space3=x.space3+2;}
	else if(line<=18){
		x.space1--;
		x.space2=x.space2+2;
		x.space3=x.space3-2;}
	else if(line<=24){
		x.space1++;
		x.space2=x.space2-2;
		x.space3=x.space3+2;}
	else if(line<=30){
		x.space1--;
		x.space2=x.space2+2;
		x.space3=x.space3-2;}
	else if(line<=36){
		x.space1++;
		x.space2=x.space2-2;
		x.space3=x.space3+2;}
	else if(line<=42){
		x.space1--;
		x.space2=x.space2+2;
		x.space3=x.space3-2;}
	}
	
	
	}
}
