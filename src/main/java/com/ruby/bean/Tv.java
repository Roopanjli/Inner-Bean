package com.ruby.bean;

public class Tv {
private Remote remote;

public Tv() {
	super();
}

public Tv(Remote remote) {
	super();
	this.remote = remote;
}

public void setRemote(Remote remote) {
	this.remote = remote;
}

@Override
public String toString() {
	return "Tv [remote=" + remote + "]";
}

}
