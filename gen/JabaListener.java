// Generated from /home/andre/IdeaProjects/Jaba/src/Jaba.g4 by ANTLR 4.13.2

    package jaba;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JabaParser}.
 */
public interface JabaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JabaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(JabaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JabaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(JabaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclaracaoSimples}
	 * labeled alternative in {@link JabaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoSimples(JabaParser.DeclaracaoSimplesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclaracaoSimples}
	 * labeled alternative in {@link JabaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoSimples(JabaParser.DeclaracaoSimplesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclaracaoComInicializacao}
	 * labeled alternative in {@link JabaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoComInicializacao(JabaParser.DeclaracaoComInicializacaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclaracaoComInicializacao}
	 * labeled alternative in {@link JabaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoComInicializacao(JabaParser.DeclaracaoComInicializacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JabaParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(JabaParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JabaParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(JabaParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JabaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(JabaParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JabaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(JabaParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JabaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(JabaParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JabaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(JabaParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JabaParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(JabaParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link JabaParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(JabaParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link JabaParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void enterRepeticao(JabaParser.RepeticaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JabaParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void exitRepeticao(JabaParser.RepeticaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JabaParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(JabaParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JabaParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(JabaParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JabaParser#entrada}.
	 * @param ctx the parse tree
	 */
	void enterEntrada(JabaParser.EntradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JabaParser#entrada}.
	 * @param ctx the parse tree
	 */
	void exitEntrada(JabaParser.EntradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JabaParser#saida}.
	 * @param ctx the parse tree
	 */
	void enterSaida(JabaParser.SaidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JabaParser#saida}.
	 * @param ctx the parse tree
	 */
	void exitSaida(JabaParser.SaidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JabaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(JabaParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JabaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(JabaParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JabaParser#expressaoLogica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoLogica(JabaParser.ExpressaoLogicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JabaParser#expressaoLogica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoLogica(JabaParser.ExpressaoLogicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JabaParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoRelacional(JabaParser.ExpressaoRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link JabaParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoRelacional(JabaParser.ExpressaoRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link JabaParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoAritmetica(JabaParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JabaParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoAritmetica(JabaParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JabaParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(JabaParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JabaParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(JabaParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JabaParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(JabaParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JabaParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(JabaParser.FatorContext ctx);
}