package com.myProject.SpringMVC.test;

public class Test {  
    
    public static void main(String[] args) {  
        while (true) {  
            //����ѧϰ�������ڷǷ���;   
            startThead();  
        }  
    }  
      
    public static int threadCount = 20;   //�߳�����   
    private static boolean isRunGrabThread = true;     //ץȡ�߳��Ƿ�ִ�����   
    static int  num = 1; //��̬����   
      
    public static void startThead(){  
        Thread[] grabThreads= new Thread[threadCount];    
        try{            
            //����-����ץȡ���߳�   
            for(int i=0;i<grabThreads.length;i++){  
                int numL = num*100;  
                System.out.println(numL);  
                //String url = "http url ?id=" + numL;  
                String url="http://www.njgjzyzx.cn/";
                //String url="http://www.baidu.com/";
                Thread searchThread=new TestThread(url);  
                num++;  
                grabThreads[i] = searchThread;  
                grabThreads[i].setDaemon(true);  
                grabThreads[i].start();  
            }  
              
            isRunGrabThread = true;  
              
            //������߳�,ȫ����ɳ����˳�   
            WhileLoop:                                
                  
            while(true){  
                  
                //���Ų��Կ���   
                //reconnectControl();      
                  
                //�ж����߳��Ƿ��������   
                for(int i=0;i<threadCount;i++){  
                    if(grabThreads[i].isAlive()){  
                        Thread.sleep(10);  
                        continue WhileLoop;  
                    }  
                }  
  
                //����ץȡ�߳�ִ�����   
                isRunGrabThread = false;  
                  
                //���߳�ִ��������˳�   
                break;  
            }  
        }   
        catch (Exception e) {  
            System.out.println("main���߳�--ϵͳ�쳣!");  
        }         
    }  
  
} 