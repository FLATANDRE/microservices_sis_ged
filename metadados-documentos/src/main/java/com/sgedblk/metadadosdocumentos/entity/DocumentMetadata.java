package com.sgedblk.metadadosdocumentos.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Data
@AllArgsConstructor
@Document(collection = "doc_metadata")
public class DocumentMetadata {
    @Id
    private String id;
    private String user;
    private String docCID;
    private String docName;
    private Date date;
    private Integer version;
}