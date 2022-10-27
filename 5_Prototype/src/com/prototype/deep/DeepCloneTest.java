package com.prototype.deep;


/**
* 深拷贝代码范例
*/
public class DeepCloneTest {
    
    public static void main(String[] args) {
        
		Sheep sheep = new Sheep(1001,"Jack",25.5);
		DeepCloneObject deepObj = new DeepCloneObject(2001,"Jack's Son");
		
		sheep.setDeepCloneObject(deepObj);
        System.out.println("sheep==>" + sheep + "\t\n deepObject==>"+ sheep.getDeepCloneObject().hashCode());  
        
		Sheep sheep1 = (Sheep)sheep.clone();
		System.out.println("sheep1==>" + sheep + "\t\n deepObject==>"+ sheep1.getDeepCloneObject().hashCode());   //这里的hashCode值和上面的不一样了，实现了深拷贝。
    }

}
