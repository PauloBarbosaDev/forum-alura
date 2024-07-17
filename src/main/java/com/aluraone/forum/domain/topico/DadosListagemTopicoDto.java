package com.aluraone.forum.domain.topico;

public record DadosListagemTopicoDto(
    Long id,
    String titulo,
    String mensagem

) {

  public DadosListagemTopicoDto(Topico topico) {
    this(topico.getId(), topico.getTitulo(), topico.getMensagem()

    );
  }
}
