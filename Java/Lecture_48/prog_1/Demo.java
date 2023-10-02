class Demo{
	int x =10;
	static int y =20;
	void fun(){
		int z =30;
	}
}

/*
 *	Bytecode:
 *	class Demo{
 *		int x;
 *		static int y;
 *		Demo(){
 *			x=10;
 *		}
 *		void fun(){
 *			int z = 30;
 *		}
 *
 *		static{
 *			y =20;
 *		}
 *	}
 * */
