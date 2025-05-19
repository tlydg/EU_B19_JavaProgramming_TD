package day57_OOP_Review01.Interface;

public class Manager {

    private Tagable tagableObj;

    public Manager(){

    }

    public Manager(Tagable tagableObj){
        this.tagableObj = tagableObj;
    }

    public void select(){
        tagableObj.select(tagableObj);
    }
}
