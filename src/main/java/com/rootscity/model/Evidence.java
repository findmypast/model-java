package com.rootscity.model;

import scala.Serializable;

import java.util.Map;

/**
 * User: dallan
 * Date: 10/13/16
 */
public class Evidence extends FirstClassObject implements Serializable {
	protected static final transient long serialVersionUID = 8152614775116414512L;
	public Fact fact;
	public Map<Long, Boolean> mediaIds;
	public String externalImageURL;
	public String text;
	public EvidenceCitation citation;
	public Map<Long, EvidencePersona> personas;
}
