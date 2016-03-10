
public class Rectangle {
	int x,y,width,height;
	
	Rectangle(){
	}	
	
	Rectangle(int _x,int _y,int _width,int _height){
		this.x = _x;
		this.y= _y;
		this.width=_width;
		this.height=_height;
	}
	
	double getWidth(){
		return this.width;
	}
	double getHeight(){
		return this.height;
	}
	public String toString(){
		return "java.Rectangle[x="+this.x+",y="+this.y+",width="+this.width+",height="+this.height+"]";
	}
	
}
