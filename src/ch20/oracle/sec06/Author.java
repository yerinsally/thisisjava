package ch20.oracle.sec06;

import lombok.Data;

@Data	//Constructor, Getter, Setter, hashCode, equals, toString 자동 생성
public class Author {
	private String AuthorId; 
	private String AuthorName; 
	private String AuthorDesc; 
}

