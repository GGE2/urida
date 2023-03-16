package com.urida.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Choice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long wordId;

    @ManyToOne
    @JoinColumn(name = "problem_proId")
    private Problem problem;
}