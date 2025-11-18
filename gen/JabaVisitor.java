// Generated from /home/andre/IdeaProjects/Jaba/src/Jaba.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JabaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JabaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JabaParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(JabaParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeclaracaoSimples}
	 * labeled alternative in {@link JabaParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoSimples(JabaParser.DeclaracaoSimplesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeclaracaoComInicializacao}
	 * labeled alternative in {@link JabaParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoComInicializacao(JabaParser.DeclaracaoComInicializacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JabaParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(JabaParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JabaParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(JabaParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JabaParser#atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicao(JabaParser.AtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JabaParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(JabaParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link JabaParser#repeticao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeticao(JabaParser.RepeticaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JabaParser#bloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco(JabaParser.BlocoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JabaParser#entrada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntrada(JabaParser.EntradaContext ctx);
	/**
	 * Visit a parse tree produced by {@link JabaParser#saida}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSaida(JabaParser.SaidaContext ctx);
	/**
	 * Visit a parse tree produced by {@link JabaParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(JabaParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JabaParser#expressaoLogica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoLogica(JabaParser.ExpressaoLogicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link JabaParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoRelacional(JabaParser.ExpressaoRelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link JabaParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoAritmetica(JabaParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link JabaParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(JabaParser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JabaParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(JabaParser.FatorContext ctx);
}