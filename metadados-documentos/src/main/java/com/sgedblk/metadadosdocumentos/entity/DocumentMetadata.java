package com.sgedblk.metadadosdocumentos.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@Document(collection = "doc_metadata")
public class DocumentMetadata {
    @Id
    private String id;
    private String user;
    private String docCID;
    private String docName;
    private LocalDateTime date;
    private Integer version;
}