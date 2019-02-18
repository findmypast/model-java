package com.rootscity.model;

/**
 * User: dallan
 * Date: 10/13/16
 */
public class Token {
    public Long treeId;
    public String treeSource;
    public String primary;
    public String fsTreeId;
    public Hinting hinting;
    public Person[] persons;
    public Evidence[] evidences;
    public Family[] families;
    public Media[] media;
    public Note[] notes;
    public Source[] sources;
    public Story[] stories;
    public PersonSummary[] relatives;
    public Long[] deletedPersonIds;
    public Long[] deletedEvidenceIds;
    public Long[] deletedFamilyIds;
    public Long[] deletedMediaIds;
    public Long[] deletedNoteIds;
    public Long[] deletedSourceIds;
    public Long[] deletedStoryIds;
    public Integer timesRetried;
}
