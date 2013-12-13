package com.peter.construct.facade;

public class Facade {
	
	Cpu cpu = new Cpu();
	
	Disk disk = new Disk();
	
	Memory memory = new Memory();
	
	public void start(){
		System.out.println("Starting Computer....");
		cpu.start();
		memory.start();
		disk.start();
	}
	
	public void shutdown(){
		System.out.println("Shuting down the Computer...");
		cpu.shutdown();
		memory.shutdown();
		disk.shutdown();
	}

}
