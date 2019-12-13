import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import javax.imageio.ImageIO;

public class converter{
	public static void main(String [] args){

	JFrame jfrm=new JFrame("Length Converter");

	jfrm.setLayout(null);

	jfrm.setSize(500,600);

	jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		  try {
            		jfrm.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("balance.jpg")))));
       		      }
		 catch (Exception e) {
            		System.out.println("File(Background picture) not Found Exception!!");
       					      }
	jfrm.pack();

	jfrm.setResizable(false);

	JLabel jlbl=new JLabel("Convert Meter into its multiples & sub-multiples");
	
	jlbl.setBounds(20,20,500,50);	

	jlbl.setFont(new Font("Verdana", Font.BOLD, 17));	

	JTextField jtxt=new JTextField();

	jtxt.setBounds(140,80,150,20);

	JButton convert=new JButton("Convert!"); 

	convert.setBounds(160,120,100,50);

	JLabel cm=new JLabel("Centimeters(cm)");

	cm.setBounds(70,210,100,20);	

	JLabel mm=new JLabel("Millimeters(mm)");

	mm.setBounds(70,240,100,20);	

	JLabel km=new JLabel("Kilometers(km)");

	km.setBounds(70,270,100,20);	

	JLabel in=new JLabel("Inches(in)");

	in.setBounds(70,300,100,20);		

	JLabel ft=new JLabel("Feet(ft)");

	ft.setBounds(70,330,100,20);

	JLabel yd=new JLabel("Yards(yd)");

	yd.setBounds(70,360,100,20);

	JTextField tcm=new JTextField();

	tcm.setBounds(170,210,150,20);

	JTextField tmm=new JTextField();

	tmm.setBounds(170,240,150,20);

	JTextField tkm=new JTextField();

	tkm.setBounds(170,270,150,20);

	JTextField tin=new JTextField();

	tin.setBounds(170,300,150,20);

	JTextField tft=new JTextField();

	tft.setBounds(170,330,150,20);

	JTextField tyd=new JTextField();

	tyd.setBounds(170,360,150,20);

	JButton currency=new JButton("Currency Converter");

	currency.setBounds(80,450,160,80);

	JButton temp=new JButton("Temperature");

	temp.setBounds(270,450,140,80);

	JLabel error=new JLabel("Error! Please Enter a Numeral Value.");

	error.setBounds(110,100,300,20);

	error.setVisible(false);
	
	JLabel zero=new JLabel("Error! Please a value greater than 0");

	zero.setBounds(110,100,300,20);

	zero.setVisible(false);

	jfrm.add(error);	

	jfrm.add(jlbl);

	jfrm.add(jtxt);

	jfrm.add(convert);

	jfrm.add(cm);

	jfrm.add(mm);

	jfrm.add(km);

	jfrm.add(in);

	jfrm.add(ft);

	jfrm.add(yd);

	jfrm.add(temp);

	jfrm.add(tcm);
	
	tcm.setEditable(false);
	
	jfrm.add(tmm);

	tmm.setEditable(false);

	jfrm.add(tkm);

	tkm.setEditable(false);

	jfrm.add(tin);

	tin.setEditable(false);

	jfrm.add(tft);

	tft.setEditable(false);

	jfrm.add(tyd);

	tyd.setEditable(false);

	jfrm.add(currency);
 		 
	jfrm.setVisible(true);
	
	event ev=new event(jtxt,tcm,tmm,tkm,tin,tft,tyd,error,zero);

	convert.addActionListener(ev);



////////////////////////////////////// FRAME 2 (Currency Converter)

	JFrame jfrm2=new JFrame("Currency Converter");

	jfrm2.setLayout(null);

	jfrm2.setSize(500,600);

	jfrm2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		  try {
            		jfrm2.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("balance.jpg")))));
       		      }
		catch (Exception e) {
            		System.out.println("File(Background picture) not Found Exception!!");
       					      }
	jfrm2.pack();

	jfrm2.setResizable(false);


	JLabel jlbl2=new JLabel("Convert Paksitani Currency(PKR) into other currencies");
	
	jlbl2.setBounds(20,20,500,50);
	
	jlbl2.setFont(new Font("Verdana", Font.BOLD, 15));	

	JTextField jtxt2=new JTextField();

	jtxt2.setBounds(140,80,150,20);

	JButton convert2=new JButton("Convert!"); 

	convert2.setBounds(160,120,100,50);

	JLabel us=new JLabel("US Dollars $");

	us.setBounds(70,210,120,20);	

	JLabel aus=new JLabel("Australian Dollars $");

	aus.setBounds(60,240,120,20);	

	JLabel sa=new JLabel("Saudi Riyal SAR");

	sa.setBounds(60,270,120,20);	

	JLabel br=new JLabel("Bahraini Denaar BRD");

	br.setBounds(60,300,125,20);		

	JLabel ir=new JLabel("Iraniani Toman IRD");

	ir.setBounds(60,330,120,20);

	JLabel ch=new JLabel("Chinese Yuan CHY");

	ch.setBounds(60,360,120,20);

	JTextField tus=new JTextField();

	tus.setBounds(190,210,150,20);

	JTextField taus=new JTextField();

	taus.setBounds(190,240,150,20);

	JTextField tsa=new JTextField();

	tsa.setBounds(190,270,150,20);

	JTextField tbr=new JTextField();

	tbr.setBounds(190,300,150,20);

	JTextField tir=new JTextField();

	tir.setBounds(190,330,150,20);

	JTextField tch=new JTextField();

	tch.setBounds(190,360,150,20);

	JButton meter=new JButton("Meter Converter");

	meter.setBounds(80,450,160,80);

	JButton temp2=new JButton("Temperature");

	temp2.setBounds(270,450,140,80);

	JLabel error2=new JLabel("Error! Please Enter a Numeral Value.");

	error2.setBounds(110,100,300,20);

	error2.setVisible(false);
	
	jfrm2.add(error2);	

	jfrm2.add(jlbl2);

	jfrm2.add(jtxt2);

	jfrm2.add(convert2);

	jfrm2.add(us);

	jfrm2.add(aus);

	jfrm2.add(sa);

	jfrm2.add(br);

	jfrm2.add(ir);

	jfrm2.add(ch);


	jfrm2.add(tus);
	
	tus.setEditable(false);
	
	jfrm2.add(taus);

	taus.setEditable(false);

	jfrm2.add(tsa);

	tsa.setEditable(false);

	jfrm2.add(tbr);

	tbr.setEditable(false);

	jfrm2.add(tir);

	tir.setEditable(false);

	jfrm2.add(tch);

	tch.setEditable(false);

	jfrm2.add(meter);

	jfrm2.add(temp2);

	jfrm2.setVisible(false);
	
	event2 ev2=new event2(jtxt2,tus,taus,tsa,tbr,tir,tch,error2);

	convert2.addActionListener(ev2);


////////////////////////////////////////////FRAME 3


	JFrame jfrm3=new JFrame("Temperature Converter");

	jfrm3.setLayout(null);

	jfrm3.setSize(500,600);

	jfrm3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		  try {
            		jfrm3.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("balance.jpg")))));
       		      }
		 catch (Exception e) {
            		System.out.println("File(Background picture) not Found Exception!!");
       					      }
	jfrm3.pack();

	jfrm3.setResizable(false);

	JLabel jlbl3=new JLabel("Celsius to Kelvin & Fehrenheit Conversion");
	
	jlbl3.setBounds(40,20,500,50);	

	jlbl3.setFont(new Font("Verdana", Font.BOLD, 17));	

	JTextField jtxt3=new JTextField();

	jtxt3.setBounds(160,80,150,20);

	JLabel error3=new JLabel("Error! Enter a numerical value.");

	error3.setBounds(150,100,300,20);

	JButton convert3=new JButton("Convert!"); 

	convert3.setBounds(180,130,100,50);

	JLabel kl=new JLabel("Kelvin(K)");

	kl.setBounds(200,230,100,20);	

	JLabel fr=new JLabel("Fahrenheit");

	fr.setBounds(200,350,100,20);	

	JTextField tkl=new JTextField();

	tkl.setBounds(160,280,150,30);

	JTextField tfr=new JTextField();

	tfr.setBounds(160,390,150,30);

	JButton meter2=new JButton("Meter Converter");

	meter2.setBounds(60,450,160,80);

	JButton currency2=new JButton("Currency Converter");

	currency2.setBounds(270,450,160,80);

	jfrm3.add(jlbl3);

	jfrm3.add(jtxt3);

	jfrm3.add(convert3);

	jfrm3.add(kl);

	jfrm3.add(fr);

	jfrm3.add(tkl);

	jfrm3.add(tfr);

	jfrm3.add(error3);

	tkl.setEditable(false);

	tfr.setEditable(false);

	jfrm3.setVisible(false);

	jfrm3.add(meter2);

	jfrm3.add(currency2);

	error3.setVisible(false);

	event3 ev3=new event3(jtxt3,tkl,tfr,error3);

	convert3.addActionListener(ev3);
	
	currency.addActionListener(new event(jfrm,jfrm2,jfrm3));	//////////// registering both frames jfrm#1

	meter.addActionListener(new event2(jfrm,jfrm2,jfrm3));	/////////////registering both frames jfrm#2

	temp2.addActionListener(new event2(jfrm,jfrm2,jfrm3));   //////////////// registering both frames jfrm#3	

	temp.addActionListener(new event(jfrm,jfrm2,jfrm3));

	meter2.addActionListener(new event3(jfrm,jfrm2,jfrm3));

	currency2.addActionListener(new event3(jfrm,jfrm2,jfrm3));
}
}

//////////////////////////////////////////// EVENT for Meter Converter
 class event implements ActionListener{
	JTextField jtxt,tcm,tmm,tkm,tin,tft,tyd;
	JLabel error,zero;
	JFrame jfrm,jfrm2,jfrm3;

event(JFrame jfrm,JFrame jfrm2,JFrame jfrm3){

	this.jfrm=jfrm;
	this.jfrm2=jfrm2;
	this.jfrm3=jfrm3;

}
event(JTextField jtxt,JTextField tcm,JTextField tmm,JTextField tkm,JTextField tin,JTextField tft,JTextField tyd,JLabel error,JLabel zero){

		this.jtxt=jtxt;
		this.tcm=tcm;
		this.tmm=tmm;
		this.tkm=tkm;
		this.tin=tin;
		this.tft=tft;
		this.tyd=tyd;					
		this.error=error;
		this.zero=zero;
																	}		
public void actionPerformed(ActionEvent ae){
		JButton b=(JButton)ae.getSource();
	String str=b.getText();
	if(str.equals("Currency Converter")){ 
	jfrm.setVisible(false); 
	jfrm3.setVisible(false);
	jfrm2.setVisible(true);	
		return;			    
					   					}
	else if(str.equals("Temperature")){ 
	jfrm.setVisible(false); 
	jfrm3.setVisible(true);
	jfrm2.setVisible(false);	
		return;			    
					   					}
	error.setVisible(false);

try{

String result="";
result+=(Double.parseDouble(jtxt.getText()))/100;
tcm.setText(result);

result="";
result+=(Double.parseDouble(jtxt.getText()))*1000;
tmm.setText(result);

result="";
result+=(Double.parseDouble(jtxt.getText()))/1000;
tkm.setText(result);

result="";
result+=(Double.parseDouble(jtxt.getText()))+39.3708;
tin.setText(result);

result="";
result+=(Double.parseDouble(jtxt.getText()))*3.28;
tft.setText(result);

result="";
result+=(Double.parseDouble(jtxt.getText()))*1.09;
tyd.setText(result);

}

catch(Exception ex){

error.setVisible(true);
zero.setVisible(true);

}
}
}

///////////////////////////// EVENT for CURRENCY CONVERTER

class event2 implements ActionListener{
	JTextField jtxt2,tus,taus,tsa,tbr,tir,tch;
	JLabel error2;
	JFrame jfrm,jfrm2,jfrm3;

event2(JFrame jfrm,JFrame jfrm2,JFrame jfrm3){

	this.jfrm=jfrm;
	this.jfrm2=jfrm2;
	this.jfrm3=jfrm3;
}

event2(JTextField jtxt2,JTextField tus,JTextField taus,JTextField tsa,JTextField tbr,JTextField tir,JTextField tch,JLabel error2){

		this.jtxt2=jtxt2;
		this.tus=tus;
		this.taus=taus;
		this.tsa=tsa;
		this.tbr=tbr;
		this.tir=tir;
		this.tch=tch;					
		this.error2=error2;
																}		
public void actionPerformed(ActionEvent ae){
	JButton b=(JButton)ae.getSource();
	String str=b.getText();
	if(str.equals("Meter Converter")){
	jfrm.setVisible(true);
	jfrm3.setVisible(false);
	jfrm2.setVisible(false);	
		 return;			}

	else if(str.equals("Temperature")){ 
	jfrm.setVisible(false); 
	jfrm3.setVisible(true);
	jfrm2.setVisible(false);	
		return;			    
					   }
	error2.setVisible(false);

try{

String result2="";
result2+=(Double.parseDouble(jtxt2.getText()))*0.0072;
tus.setText(result2);

result2="";
result2+=(Double.parseDouble(jtxt2.getText()))*0.0099;
taus.setText(result2);

result2="";
result2+=(Double.parseDouble(jtxt2.getText()))*0.027;
tsa.setText(result2);

result2="";
result2+=(Double.parseDouble(jtxt2.getText()))*0.0027;
tbr.setText(result2);

result2="";
result2+=(Double.parseDouble(jtxt2.getText()))*302.72;
tir.setText(result2);

result2="";
result2+=(Double.parseDouble(jtxt2.getText()))*0.049;
tch.setText(result2);

}

catch(Exception ex){

error2.setVisible(true);

}
}
}

//////////////////////////////////  EVENT for TEMPERATURE CONVERTER

 class event3 implements ActionListener{
	JTextField jtxt3,tkl,tfr;
	JLabel error3;
	JFrame jfrm,jfrm2,jfrm3;

event3(JFrame jfrm,JFrame jfrm2,JFrame jfrm3){

	this.jfrm=jfrm;
	this.jfrm2=jfrm2;
	this.jfrm3=jfrm3;

}
event3(JTextField jtxt3,JTextField tkl,JTextField tfr,JLabel error3){

		this.jtxt3=jtxt3;
		this.tkl=tkl;
		this.tfr=tfr;
		this.error3=error3;
								}		
public void actionPerformed(ActionEvent ae){
		JButton b=(JButton)ae.getSource();
	String str=b.getText();
	if(str.equals("Meter Converter")){ 
	jfrm.setVisible(true); 
	jfrm2.setVisible(false);	
	jfrm3.setVisible(false);
		return;			    
					   }
	else if(str.equals("Currency Converter")){ 
	jfrm.setVisible(false); 
	jfrm3.setVisible(false);
	jfrm2.setVisible(true);	
		return;			    
											}
	error3.setVisible(false);

try{

String result3="";
result3+=(Double.parseDouble(jtxt3.getText()))+273.15;
tkl.setText(result3);

result3="";
result3+=((Double.parseDouble(jtxt3.getText()))*1.8)+32;
tfr.setText(result3);


}

catch(Exception ex){

error3.setVisible(true);

}
}
}