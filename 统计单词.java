package ͳ�Ƶ��ʸ���;
import java.io.*;
import java.util.*;

public class ͳ�Ƶ��� {
	public static void main(String[] args) 
	{
	  try{
		  FileReader fr1=new FileReader("�����ı�.txt");   //��ȡ�ı�
		  BufferedReader bf1=new BufferedReader(fr1);
		  String str1 = null;String [] str=null;String [] str2=null;
		  while((str1=bf1.readLine())!=null)            //���ж�ȡ
		  {			  											     						
			  str=str1.split(" ");                      //���ո��з��ַ���               
				for(int i=0;i<str.length;i++)
				 {
				  str2=str[i].split("");                //��һ���ַ�����Ϊһ��һ�����ַ�����ҪĿ����Ϊ�˺ð���ĸ����ķ���ȥ��
				  String a=null;
				  for(int j=0;j<str2.length;j++)       
				  {					  
					  if(str2[j].charAt(0)>='A'&&str2[j].charAt(0)<='Z'||str2[j].charAt(0)>='a'&&str2[j].charAt(0)<='z')
					  {
						  str2[j]=str2[j].toLowerCase();  //��д��Сд
						  if(a==null)
							  a=str2[j];
						  else
						      a=a+str2[j];                //һ��������ֻ����ĸ���ַ����������ĵ���
					  }						  					  				  
				  }
				  str[i]=a;			  
				 }
			}
		 fr1.close(); bf1.close();	
		Map<String,Integer> map = new HashMap<String,Integer>(); //map�ӿ�ͳ����ĸ����Ƶ��
	    for (int j = 0; j < str.length; j++) 
	    {
	      Integer count = map.get(str[j]);       //һ�����ʳ��ֵĴ���
	      if(count==null)                        //���û�г��ֹ�����һ��
	      {
	      map.put(str[j],1);
	      }
	      else                                  //�����ǰ���ֹ�����ô������һ
	      {
	      map.put(str[j],++count);
	      }
	    }
	    String [] str3=null; 
	    for(Map.Entry<String,Integer> entry : map.entrySet())
	    {
	    	if(entry.getKey()!=null)               
		      str3=entry.getKey().split("");
	    	if( str3!=null&&str3.length>3)                     //str3����Ϊ�գ����������ֻ�к���3����ĸ���ϵĵ��ʲŴ�ӡ
	    	  System.out.println(entry.getKey() +": "+"\t"+ entry.getValue());
	    }
	 }catch(Exception e){
			e.printStackTrace();}
}
}
