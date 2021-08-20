package one.digitalinnovation.jdbc.part3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

    //1 - Consulta
    public List<Aluno> list() {
        //preparar lista que irá retornar alunos após a consulta no banco de dados

        List<Aluno> alunos = new ArrayList<>();

        try(Connection conn = ConnectionFactory.getConnection()) {

         PreparedStatement prst = conn.prepareStatement("SELECT * FROM aluno");
         ResultSet rs = prst.executeQuery();
         while(rs.next()) {
             Aluno aluno = new Aluno(
                     rs.getInt("id"),
                     rs.getString("nome"),
                     rs.getInt("idade"),
                     rs.getString("estado"));
             alunos.add(aluno);
         }

        } catch (SQLException e) {

        }
        return alunos;
    }
}
