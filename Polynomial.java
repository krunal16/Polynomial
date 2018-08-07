import java.util.HashMap;
import java.util.ArrayList;
import java.util.*;
import java.io.*;
import java.util.regex.*;

class Polynomial {


	public static void main(String Args[]){
     ArrayList<Integer> coeffPoly=new ArrayList<Integer>();
     for (int i = 0; i < 10; i++) {
  		coeffPoly.add(0);
		}

      
     String polynomial=new String("3x^5 - 4x - 4x^2 + 6");

     polynomial=polynomial.replaceAll("\\-","+-");
     
     polynomial=polynomial.replaceAll("\\s","");
     String[] terms=polynomial.split("\\+");
     for(int i=0;i<terms.length;i++){
     	int power;int coeff=0;
     	
     	String[] exp=terms[i].split("\\^");
     		if(exp.length>1){
     		      power=Integer.parseInt(exp[1]);
     		}
     		else if(terms[i].indexOf('x')!=-1){
     			power=1;
     		}
     		else {power=0;}
     		//System.out.println(power);

     		if(exp[0].equals("x")){
     			coeff=1;
     		}
     		else{

     		 String[] findCoeff=exp[0].split("x");
     		 if(findCoeff[0].equals("-"))coeff=-1;
     		 else {
     		 coeff=Integer.parseInt(findCoeff[0]);
     		}
     	}
     	//System.out.println(coeff);

     	coeffPoly.set(power,coeff);
     }
     for(Integer i:coeffPoly){
     	System.out.println(i);
     }
 }




}