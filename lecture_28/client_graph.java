package lecture_28;

import java.util.HashMap;

/**
 * @author:- Abhinav_kumar
 * @email:- abhinavpnp.kumar@gmail.com
 * @date :-10-Nov-2018
 */
public class client_graph {

	public static void main(String[] args) {
		graph gp = new graph();
		gp.addvertex("A");
		gp.addvertex("B");
		gp.addvertex("C");
		gp.addvertex("D");
		gp.addvertex("E");
		gp.addvertex("F");
		gp.addvertex("G");

		gp.addedges("A", "B", 10);
		gp.addedges("A", "D", 20);
		gp.addedges("B", "C", 5);
		gp.addedges("C", "D", 3);
		gp.addedges("D", "E", 1);
		gp.addedges("E", "F", 2);
		gp.addedges("F", "G", 30);
		gp.addedges("E", "G", 40);
//		gp.removevertex("A");
		gp.display();
		System.out.println(gp.noofedges());
		System.out.println(gp.noofvertex());
		System.out.println(gp.haspath("A", "F", new HashMap<>()));
		System.out.println(gp.bfs("A", "F"));
		System.out.println(gp.dfs("A", "F"));
		gp.bft();
		gp.dftstack();
		System.out.println(gp.ISconnected());
		System.out.println(gp.IScyclic());
		System.out.println(gp.IStree());
		System.out.println(gp.getconnectedelement());

	}

}
