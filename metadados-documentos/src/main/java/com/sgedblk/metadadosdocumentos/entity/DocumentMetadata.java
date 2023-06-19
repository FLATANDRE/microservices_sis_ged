package com.sgedblk.metadadosdocumentos.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "doc_metadata")
public class DocumentMetadata {
    @Id
    private String id;
    private String user;
    private String docCID;
    private String docName;
    private String docInfo;
    private String docHash;
    private LocalDateTime date;
    private Integer version;
}