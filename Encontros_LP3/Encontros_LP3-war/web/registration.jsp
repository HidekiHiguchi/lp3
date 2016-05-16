
<%@ include file="includes/siteUp.jsp" %>
    <script type='text/JavaScript' src='/Encontros_LP3-war/scripts/jquery.cep.js'></script>
    <script type='text/JavaScript' src='/Encontros_LP3-war/scripts/jquery.cep.min.js'></script>
    <script type='text/JavaScript' src='/Encontros_LP3-war/scripts/forms.js'></script>
        <div id="reg_rule">
        <ul>
            <li>-Nome de usuário deve conter apenas letras e sublinhados.</li><br>
            <li>-E-mails devem conter o formato correto.</li><br>
            <li>-Senhas devem conter pelo menos 6 caractéres.</li><br>
            <li>-Senhas devem conter:
                <ul>
                    <li>&nbsp*Pelo menos 1 letra maiúscula. (A..Z)</li>
                    <li>&nbsp*Pelo menos 1 letra minúscula. (a..z)</li>
                    <li>&nbsp*Pelo menos 1 número. (0..9)</li>
                </ul>
            </li><br>
            <li>-Escolha a pergunta secreta com cuidado.</li><br>
            <li>-Todos os campos devem ser preenchidos</li>
        </ul>
      </div><br><br>
      <div class="registro">
        <form action="<?php echo esc_url($_SERVER['PHP_SELF']); ?>"
                method="post"
                name="registration_form">
            Nome de Usuário:<br><input type='text'
                name='username'
                id='username' /><br><br>
            E-mail:<br><input type="email" name="email" id="email" /><br><br>
            Senha:<br><input type="password"
                             name="password"
                             id="password"/><br><br>
            Confirmação de Senha:<br><input type="password"
                                     name="confirmpwd"
                                     id="confirmpwd" /><br><br>

            Nome Completo:<br><input type="text" name="fullname" id="fullname" /><br><br>

            CEP:<br><input type="text" name="input_cep" id="input_cep" /><br><br>

            <table id="half_form_view">

              <tr>
                <th>Estado:<br><input type="text" name="uf" id="uf" data-cep="uf" /><br><br></th>
                <th>Cidade:<br><input type="text" name="cidade" id="cidade" data-cep="cidade" /><br><br></th>
              </tr>
              <tr>
                <td>Bairro:<br><input type="text" name="bairro" id="bairro" data-cep="bairro" /><br><br></td>
                <td>Rua:<br><input type="text" name="nome_rua" id="nome_rua" data-cep="logradouro" /><br><br></td>
              </tr>
              <tr>
                <td>Número:<br><input type="text" name="num_casa" id="num_casa" /><br><br></td>
                <td>Complemento<br><input type="text" name="complemento" id="complemento" /><br><br></td>
              </tr>
            </table>

            <script>$('#input_cep').cep();</script>

            <input type="hidden" name="tipo" id="tipo" data-cep="tipo_logradouro" />

            Telefone:<br><input type="text" onkeypress='return event.charCode >= 0 && event.charCode <= 64 '  name="tel" id="tel"></input><br><br>

            CPF/CNPJ:<br><input type="text" name="cpf" id="cpf" /><br><br>

            <select name="pergunta" id="pergunta">
              <option value="Qual foi o primeiro livro que você leu?">Qual foi o primeiro livro que você leu?</option>
              <option value="Qual foi o melhor filme que você já assistiu?">Qual foi o melhor filme que você já assistiu?</option>
              <option value="Qual é o lugar que você sempre quis visitar?">Qual é o lugar que você sempre quis visitar?</option>
              <option value="Qual é o seu personagem Histórico/Fictício favorito?">Qual é o seu personagem Histórico/Fictício favorito?</option>
              <option value="Qual é o seu prato favorito?">Qual é o seu prato favorito?</option>
              <option value="Qual é a sua musica favorita?">Qual é a sua musica favorita?</option>
            </select><br>

            Resposta da Pergunta:<br><input type="text" name="resposta" id="resposta" /><br><br>


            <div class="buttonHolder">
            <input type="button"
                   value="Registrar" id="vini" tabindex="-1"
                   onclick="return regformhash(this.form,
                                   this.form.username,
                                   this.form.email,
                                   this.form.password,
                                   this.form.confirmpwd,
                                   this.form.fullname,
                                   this.form.input_cep,
                                   this.form.uf,
                                   this.form.cidade,
                                   this.form.bairro,
                                   this.form.nome_rua,
                                   this.form.num_casa ,
                                   this.form.tipo ,
                                   this.form.complemento,
                                   this.form.tel,
                                   this.form.cpf,
                                   this.form.pergunta,
                                   this.form.resposta);" />

              <input type='submit' style='display: none'
              onclick="return regformhash(this.form,
                              this.form.username,
                              this.form.email,
                              this.form.password,
                              this.form.confirmpwd,
                              this.form.fullname,
                              this.form.input_cep,
                              this.form.uf,
                              this.form.cidade,
                              this.form.bairro,
                              this.form.nome_rua,
                              this.form.num_casa ,
                              this.form.tipo ,
                              this.form.complemento,
                              this.form.tel  ,
                              this.form.cpf,
                              this.form.pergunta,
                              this.form.resposta);" />
          </div>
        </form>
      </div><br>
<%@ include file="includes/siteDown.jsp" %>
