interface Demo1{
	void m1();
}
interface Demo2 extends Demo1{
	void m2();
}
interface Demo3 extends Demo1,Demo2{
	void m3();
}
