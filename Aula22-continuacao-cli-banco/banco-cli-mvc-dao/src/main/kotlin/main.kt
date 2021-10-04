import dao.ProdutoDAO
import models.Produto
import java.sql.DriverManager

fun main(args: Array<String>) {
    //Cria um DAO para os produtos
    val produtosDao = ProdutoDAO()
    produtosDao.deletar(7)
    produtosDao.atualizar(Produto(8,"Samsung",350.0,2))
    var produtos = produtosDao.pegarTodosSeguro()
    //Intera pelo resultado obtido
    for (produto in produtos){
        println(produto)
    }
    //produtosDao.inserirUm(Produto(0, "Agua", 5.0,12))
    //produtosDao.inserirVarios(listOf(
    //    Produto(0,"Clementine", 799.98, 1),
    //    Produto(0,"Listerine",15.99,80)))

}