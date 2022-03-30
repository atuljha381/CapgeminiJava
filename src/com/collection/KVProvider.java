package com.collection;

public class KVProvider<K,V> {
	private K key;
	private V val;
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getVal() {
		return val;
	}
	public void setVal(V val) {
		this.val = val;
	}
	public void put(K key,V val) {
		this.key = key;
		this.val = val;
	}
	public V get(K keyK) {
		return this.val;
	}
	
	
	
}
