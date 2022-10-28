package com.prototype.deep;


/**
* 深拷贝代码范例
*/
public class DeepCloneTest {
    
    public static void main(String[] args) {
        
		Sheep sheep = new Sheep(1001,"Jack",25.5);
		DeepCloneObject deepObj = new DeepCloneObject(2001,"Jack's Son");
		
		//第一种深拷贝方式
		sheep.setDeepCloneObject(deepObj);
        System.out.println("sheep==>" + sheep + "\t\n deepObject==>"+ sheep.getDeepCloneObject().hashCode());
		System.out.println("sheep.dco==>" + sheep.getDeepCloneObject());
        
		Sheep sheep1 = (Sheep)sheep.clone();
		System.out.println("sheep1==>" + sheep + "\t\n deepObject==>"+ sheep1.getDeepCloneObject().hashCode());   //这里的hashCode值和上面的不一样了，实现了深拷贝。
		System.out.println("sheep1.dco==>" + sheep1.getDeepCloneObject());
		
		//第二种深拷贝方式
		Sheep sheep2 = new Sheep(1002,"Tommy",3.5);
		sheep2.setDeepCloneObject(new DeepCloneObject(3001,"Tommy's Son"));
		Sheep sheep3 = (Sheep)sheep2.deepCloneBySerialize();
		System.out.println("sheep2==>" + sheep2.hashCode() + "," + sheep2);
		DeepCloneObject dco2 = sheep2.getDeepCloneObject();
		System.out.println("sheep2.deepObj==>" + dco2 + ",dco2.hashCode==>" + dco2.hashCode());
		System.out.println("sheep3==>" + sheep3.hashCode() + "," + sheep3 + "," + sheep3.getDeepCloneObject());
		DeepCloneObject dco3 = sheep3.getDeepCloneObject();
		System.out.println("sheep3.deepObj==>" + dco3 + ",dco3.hashCode==>" + dco3.hashCode());

    }

}
