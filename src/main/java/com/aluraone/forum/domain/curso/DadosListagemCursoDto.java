package com.aluraone.forum.domain.curso;

public record DadosListagemCursoDto(Long id,
    String nome) {

  public DadosListagemCursoDto(Curso curso) {
    this(curso.getId(), curso.getNome());
  }

}
