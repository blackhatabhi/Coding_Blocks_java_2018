package lecture_28;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * @author:- Abhinav_kumar
 * @email:- abhinavpnp.kumar@gmail.com
 * @date :-10-Nov-2018
 */
public class graph {
	private class vertex {
		HashMap<String, Integer> nbrs = new HashMap<>();
	}

	HashMap<String, vertex> vtas = new HashMap<>();

	public int noofvertex() {
		return vtas.size();
	}

	public boolean containsvertex(String vname) {
		return vtas.containsKey(vname);
	}

	public void addvertex(String vnam) {
		vertex vtx = new vertex();
		vtas.put(vnam, vtx);

	}

	public void removevertex(String vname) {
		vertex vtx = vtas.get(vname);
		for (String nbr : vtx.nbrs.keySet()) {
			vertex nbrvtx = vtas.get(nbr);
			nbrvtx.nbrs.remove(vname);
		}
		vtas.remove(vname);
	}

	public int noofedges() {
		int sum = 0;
		for (String key : vtas.keySet()) {
			vertex vtx = vtas.get(key);
			sum += vtx.nbrs.size();
		}
		return sum / 2;
	}

	public boolean containsedge(String vname1, String vname2) {
		vertex vtx1 = vtas.get(vname1);
		vertex vtx2 = vtas.get(vname2);
		if (vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vname2)) {
			return false;
		}
		return true;
	}

	public void addedges(String vname1, String vname2, int cost) {
		vertex vtx1 = vtas.get(vname1);
		vertex vtx2 = vtas.get(vname2);
		if (vtx1 == null || vtx2 == null || vtx1.nbrs.containsKey(vname2)) {
			return;
		}
		vtx1.nbrs.put(vname2, cost);
		vtx2.nbrs.put(vname1, cost);
	}

	public void removeedges(String vname1, String vname2) {
		vertex vtx1 = vtas.get(vname1);
		vertex vtx2 = vtas.get(vname2);
		if (vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vname2)) {
			return;
		}
		vtx1.nbrs.remove(vname2);
		vtx2.nbrs.remove(vname1);
	}

	public void display() {
		for (String key : vtas.keySet()) {
			vertex vtx = vtas.get(key);
			String Str = key + "->" + vtx.nbrs;
			System.out.println(Str);
		}

	}

	public boolean haspath(String src, String dst, HashMap<String, Boolean> processed) {
		processed.put(src, true);
		if (containsedge(src, dst)) {
			return true;
		}
		vertex vtx = vtas.get(src);
		for (String nbr : vtx.nbrs.keySet()) {
			if (!processed.containsKey(nbr) && haspath(nbr, dst, processed)) {
				return true;
			}
		}
		return false;
	}

	private class pair {
		String vname;
		String psf;
	}

	public boolean bfs(String src, String dst) {
		HashMap<String, Boolean> processed = new HashMap<>();
		LinkedList<pair> queue = new LinkedList<>();
		pair sp = new pair();
		sp.psf = src;
		sp.vname = src;
		queue.addLast(sp);
		while (!queue.isEmpty()) {
			pair rp = queue.removeFirst();
			if (processed.containsKey(rp.vname)) {
				continue;
			}
			processed.put(rp.vname, true);
			if (containsedge(rp.vname, dst)) {
				System.out.println(rp.psf + dst);
				return true;
			}
			vertex vtx = vtas.get(rp.vname);
			for (String nbr : vtx.nbrs.keySet()) {
				if (!processed.containsKey(nbr)) {
					pair np = new pair();
					np.vname = nbr;
					np.psf = rp.psf + nbr;
					queue.addLast(np);
				}
			}
		}
		return false;
	}

	public boolean dfs(String src, String dst) {
		HashMap<String, Boolean> processed = new HashMap<>();
		LinkedList<pair> stack = new LinkedList<>();
		pair sp = new pair();
		sp.psf = src;
		sp.vname = src;
		stack.addFirst(sp);
		while (!stack.isEmpty()) {
			pair rp = stack.removeFirst();
			if (processed.containsKey(rp.vname)) {
				continue;
			}
			processed.put(rp.vname, true);
			if (containsedge(rp.vname, dst)) {
				System.out.println(rp.psf + dst);
				return true;
			}
			vertex vtx = vtas.get(rp.vname);
			for (String nbr : vtx.nbrs.keySet()) {
				if (!processed.containsKey(nbr)) {
					pair np = new pair();
					np.vname = nbr;
					np.psf = rp.psf + nbr;
					stack.addFirst(np);
				}
			}
		}
		return false;
	}

	public void bft() {
		HashMap<String, Boolean> processed = new HashMap<>();
		for (String key : vtas.keySet()) {
			if (processed.containsKey(key)) {
				continue;
			}
			LinkedList<pair> queue = new LinkedList<>();
			pair sp = new pair();
			sp.psf = key;
			sp.vname = key;
			queue.addLast(sp);
			while (!queue.isEmpty()) {
				pair rp = queue.removeFirst();
				if (processed.containsKey(rp.vname)) {
					continue;
				}
				processed.put(rp.vname, true);
				System.out.println(rp.vname + "via" + rp.psf);
				vertex vtx = vtas.get(rp.vname);
				for (String nbr : vtx.nbrs.keySet()) {
					if (!processed.containsKey(nbr)) {
						pair np = new pair();
						np.vname = nbr;
						np.psf = rp.psf + nbr;
						queue.addLast(np);
					}
				}
			}
		}
	}

	public void dftstack() {
		HashMap<String, Boolean> processed = new HashMap<>();
		for (String key : vtas.keySet()) {
			if (processed.containsKey(key)) {
				continue;
			}
			LinkedList<pair> Stack = new LinkedList<>();
			pair sp = new pair();
			sp.psf = key;
			sp.vname = key;
			Stack.addFirst(sp);
			while (!Stack.isEmpty()) {
				pair rp = Stack.removeFirst();
				if (processed.containsKey(rp.vname)) {
					continue;
				}
				processed.put(rp.vname, true);
				System.out.println(rp.vname + "via" + rp.psf);

				vertex vtx = vtas.get(rp.vname);
				for (String nbr : vtx.nbrs.keySet()) {
					if (!processed.containsKey(nbr)) {
						pair np = new pair();
						np.vname = nbr;
						np.psf = rp.psf + nbr;
						Stack.addFirst(np);
					}
				}
			}
		}
	}

	public boolean ISconnected() {
		HashMap<String, Boolean> processed = new HashMap<>();
		for (String key : vtas.keySet()) {
			if (processed.containsKey(key)) {
				return true;
			}
			LinkedList<pair> Stack = new LinkedList<>();
			pair sp = new pair();
			sp.psf = key;
			sp.vname = key;
			Stack.addFirst(sp);
			while (!Stack.isEmpty()) {
				pair rp = Stack.removeFirst();
				if (processed.containsKey(rp.vname)) {
					continue;
				}
				processed.put(rp.vname, true);
//				System.out.println(rp.vname + "via" + rp.psf);

				vertex vtx = vtas.get(rp.vname);
				for (String nbr : vtx.nbrs.keySet()) {
					if (!processed.containsKey(nbr)) {
						pair np = new pair();
						np.vname = nbr;
						np.psf = rp.psf + nbr;
						Stack.addFirst(np);
					}
				}
			}
		}
		return false;
	}

	public boolean IScyclic() {
		HashMap<String, Boolean> processed = new HashMap<>();
		for (String key : vtas.keySet()) {
			if (processed.containsKey(key)) {
				continue;
			}
			LinkedList<pair> Stack = new LinkedList<>();
			pair sp = new pair();
			sp.psf = key;
			sp.vname = key;
			Stack.addFirst(sp);
			while (!Stack.isEmpty()) {
				pair rp = Stack.removeFirst();
				if (processed.containsKey(rp.vname)) {
					return true;
				}
				processed.put(rp.vname, true);
//				System.out.println(rp.vname + "via" + rp.psf);

				vertex vtx = vtas.get(rp.vname);
				for (String nbr : vtx.nbrs.keySet()) {
					if (!processed.containsKey(nbr)) {
						pair np = new pair();
						np.vname = nbr;
						np.psf = rp.psf + nbr;
						Stack.addFirst(np);
					}
				}
			}
		}
		return false;
	}

	public boolean IStree() {
		if (IScyclic() && !ISconnected()) {
			return false;
		}
		return true;
	}

	public ArrayList<ArrayList<String>> getconnectedelement() {
		ArrayList<ArrayList<String>> ans = new ArrayList<>();

		HashMap<String, Boolean> processed = new HashMap<>();
		LinkedList<pair> Stack = new LinkedList<>();
		pair sp = new pair();
		for (String key : vtas.keySet()) {
			if (processed.containsKey(key)) {
				continue;
			}

			ArrayList<String> subans = new ArrayList<>();

			sp.psf = key;
			sp.vname = key;
			Stack.addFirst(sp);

			while (!Stack.isEmpty()) {
				pair rp = Stack.removeFirst();

				if (processed.containsKey(rp.vname)) {
					continue;
				}
				processed.put(rp.vname, true);
				subans.add(rp.vname);
				vertex vtx = vtas.get(rp.vname);
				for (String nbr : vtx.nbrs.keySet()) {
					if (!processed.containsKey(nbr)) {
						pair np = new pair();
						np.vname = nbr;
						np.psf = rp.psf + nbr;
						Stack.addFirst(np);
					}
				}

			}
			ans.add(subans);
		}
		return ans;

	}
	public boolean Isbipartite() {
		
	}
}
