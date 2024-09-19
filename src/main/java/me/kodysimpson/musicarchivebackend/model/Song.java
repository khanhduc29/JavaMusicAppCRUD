package me.kodysimpson.musicarchivebackend.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Song {

    @Id
    private String id;

    private String fileName;

    private String title;
    private String artist;
    private boolean isFavorited;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public boolean isFavorited() {
		return isFavorited;
	}
	public void setFavorited(boolean isFavorited) {
		this.isFavorited = isFavorited;
	}

    public Song() {
		// TODO Auto-generated constructor stub
	}
	public Song(String id, String fileName, String title, String artist, boolean isFavorited) {
		super();
		this.id = id;
		this.fileName = fileName;
		this.title = title;
		this.artist = artist;
		this.isFavorited = isFavorited;
	}
    

}
