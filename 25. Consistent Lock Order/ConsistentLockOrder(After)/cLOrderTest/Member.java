package cLOrderTest;

public class Member extends Thread{
	
	Directory src;
	Directory dest;
	FileSysUtil_Rev fSysUtil;
	
	public Member(Directory src, Directory dest, FileSysUtil_Rev fSysUtil){
		this.src = src;
		this.dest = dest;
		this.fSysUtil = fSysUtil;
		start();
	}
	
	public void run(){
		fSysUtil.moveContents(src, dest);
	}
}
