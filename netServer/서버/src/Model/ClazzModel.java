package Model;

import java.util.ArrayList;

/**
 * Created by skrud on 2017-10-23.
 */
public class ClazzModel {

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public ArrayList<String> getAttributeList() {
        return attributeList;
    }

    public void setAttributeList(ArrayList<String> attributeList) {
        this.attributeList = attributeList;
    }

    public ArrayList<String> getMethodList() {
        return methodList;
    }

    public void setMethodList(ArrayList<String> methodList) {
        this.methodList = methodList;
    }

    private String className;
    private ArrayList<String> attributeList;
    private ArrayList<String> methodList;
    private String clNo;
    private int x;
    private int y;
    private int w;
    private int h;
    private String bounds;

    public ClazzModel() {
        className = "";
        attributeList = new ArrayList<>(0);
        methodList = new ArrayList<>(0);
        clNo = "";
        x=0;
        y=0;
        w=0;
        h=0;
        bounds = "";
    }
    public ClazzModel(String name, ArrayList<String> atts, ArrayList<String> mets,String bounds){
        this.className = name;
        this.attributeList = atts;
        this.methodList = mets;
        this.bounds = bounds;
        String arr[];
        arr = bounds.split(",");
        this.x = Integer.parseInt(arr[0]);
        this.y = Integer.parseInt(arr[1]);
        this.w = Integer.parseInt(arr[2]);
        this.h = Integer.parseInt(arr[3]);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public void addAttList(String a){
        boolean flag = true;
        for(String str: attributeList){
            if(a.equals(str)){
                flag = false;
            }
        }
        if(flag) attributeList.add(a);
    }
    public void rmAttList(String a){
        attributeList.remove(a);
    }
    public void addMethodList(String m){
        boolean flag = true;
        for(String str: methodList) {
            if (m.equals(str)) {
                flag = false;
            }
        }
        if(flag) methodList.add(m);
    }
    public void rmMethodList(String m){
        methodList.remove(m);
    }


    public String getClNo() {
        return clNo;
    }

    public String getBounds() {
        return bounds;
    }

    public void setBounds(String bounds) {
        this.bounds = bounds;
        String []arr = bounds.split(",");
        this.x = Integer.parseInt(arr[0]);
        this.y = Integer.parseInt(arr[1]);
        this.w = Integer.parseInt(arr[2]);
        this.h = Integer.parseInt(arr[3]);
    }

    public void setClNo(String clNo) {
        this.clNo = clNo;
    }


}
