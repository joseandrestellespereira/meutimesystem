<%@page import="br.pro.jose.enums.StatusEnum"%>
<%@page import="br.pro.jose.enums.PeriodicidadeEnum"%>
<%@page import="java.text.NumberFormat"%>
<%@page import="java.util.*"%>
<%@page import="br.pro.jose.beans.PlanoMensalidadeBean" %>

<% List<PlanoMensalidadeBean> lista_plano_mensalidade = (List<PlanoMensalidadeBean>) request.getAttribute("lista_plano_mensalidade");
   String mensagem = (String) request.getAttribute("mensagem");
%>

<html>
    <head>
        <meta charset="ISO-8859-1">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Meu Time System | Planos Mensalidade</title>
        <!-- Tell the browser to be responsive to screen width -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- Font Awesome -->
        <link rel="stylesheet" href="plugins/font-awesome/css/font-awesome.min.css">
        <!-- Ionicons -->
        <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
        <!-- Theme style -->
        <link rel="stylesheet" href="dist/css/adminlte.min.css">
        <!-- iCheck -->
        <link rel="stylesheet" href="plugins/iCheck/flat/blue.css">
        <link rel="stylesheet" href="plugins/jquery/jquery.mask.js">
        <!-- Morris chart -->
        <link rel="stylesheet" href="plugins/morris/morris.css">
        <!-- jvectormap -->
        <link rel="stylesheet" href="plugins/jvectormap/jquery-jvectormap-1.2.2.css">
        <!-- Date Picker -->
        <link rel="stylesheet" href="plugins/datepicker/datepicker3.css">
        <!-- Daterange picker -->
        <link rel="stylesheet" href="plugins/daterangepicker/daterangepicker-bs3.css">
        <!-- bootstrap wysihtml5 - text editor -->
        <link rel="stylesheet" href="plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
        <!-- Google Font: Source Sans Pro -->
        <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">
        <!-- Tabela Stilos -->
        <link rel="stylesheet" href="plugins/custom/tabela.css">
        <!--Modal customizada-->
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
        <script src="plugins/custom/jquery-3.1.1.min.js"></script>
        <script src="plugins/bootstrap/js/bootstrap.min.js"></script>
        <script src="plugins/custom/bootbox.min.js"></script>
       
    </head>
    <body class="hold-transition sidebar-mini" onload="Mensagem()">
        <div class="wrapper">
            <!-- Navbar -->
            <nav class="main-header navbar navbar-expand bg-white navbar-light border-bottom">
                <!-- Left navbar links -->
                <%@include  file="pages/menuSuperior.html" %>
            </nav>
            <!-- /.navbar -->
            <!-- Main Sidebar Container -->
            <aside class="main-sidebar sidebar-dark-primary elevation-4">
                <!-- Brand Logo -->
                <%@include  file="pages/menuLateral.html" %>
                <!-- /.sidebar -->
            </aside>
            <!-- Content Wrapper. Contains page content -->
            <div class="content-wrapper">
                <section  class="content">
                    <div class="container-fluid">
                        <!-- Small boxes (Stat box) -->
                        <div class="row">
                            <div class="col-2">
                            </div>
                            <div  class="card card-primary">
                                <div class="card-header">
                                    <h3 class="card-title">Cadastro Planos de Mensalidade</h3>
                                </div>
                                <!-- /.card-header -->
                                <!-- form start -->
                                <form action="planomensalidadeservlet" method="POST">
                                    <div class="card-body">
                                        <div class="row">
                                            <div class="col-3">
                                                <label>Código:</label>
                                                <input class="form-control" readonly="true" name="codigo" type="text" id="codigo" placeholder="Código">
                                            </div>
                                            <div class="col-9">
                                                <label>Descrição:</label>                                         
                                                <input class="form-control" required="" name="descricao" type="text" id="descricao" placeholder="Descrição" >
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="col-3">
                                                <label>Valor:</label>
                                                <input class="form-control" required="" name="valor" type="text" id="valor" placeholder="Valor">
                                            </div>
                                            <div class="col-3">
                                                <label>Vencimento:</label> 
                                                <select name="dia_vencimento" id="dia_vencimento" class="form-control">
                                                    <%
                                                        for (int i = 1; i <= 30; i++) {
                                                            out.println("<option value=\""+ i +"\">" + i + "</option>");
                                                        }
                                                    %>
                                                </select>
                                            </div>
                                            <div class="col-3">
                                                <label>Periodicidade:</label> 
                                                <select name="periodicidade" id="periodicidade" class="form-control">
                                                    <%
                                                        out.println("<option value=\""+ PeriodicidadeEnum.Mensal.toString() +"\">" + PeriodicidadeEnum.Mensal.toString() + "</option>");
                                                        out.println("<option value=\""+ PeriodicidadeEnum.Trimestral.toString() +"\">" + PeriodicidadeEnum.Trimestral.toString() + "</option>");
                                                        out.println("<option value=\""+ PeriodicidadeEnum.Semestral.toString() +"\">" + PeriodicidadeEnum.Semestral.toString() + "</option>");
                                                        out.println("<option value=\""+ PeriodicidadeEnum.Anual.toString() +"\">" + PeriodicidadeEnum.Anual.toString() + "</option>");
                                                    %>
                                                </select>
                                            </div>
                                            <div class="col-3">
                                                <label>Status:</label> 
                                                <select name="status" id="status" class="form-control">
                                                    <%
                                                        out.println("<option value=\""+ StatusEnum.Ativo.toString() +"\">" + StatusEnum.Ativo.toString() + "</option>");
                                                        out.println("<option value=\""+ StatusEnum.Inativo.toString() +"\">" + StatusEnum.Inativo.toString() + "</option>");
                                                    %>
                                                </select>
                                            </div>
                                        </div>
                                    </div>
                                    <!-- /.card-body -->
                                    <div class="card-footer">
                                        <input type="hidden" name="ope" value="gravar_plano_mensalidade">    
                                        <button type="submit" class="btn btn-primary">Salvar</button>
                                        <button type="reset" class="btn btn-default float-right">Cancelar</button>
                                    </div>
                                </form>
                            </div>
                        </div><!-- /.container-fluid -->
                        <div class="row">
                            <div class="col-2">
                            </div>
                            <div class="card card-primary">
                                <div class="card-header">
                                    <h3 class="card-title">Consulta</h3>
                                </div>
                                <!-- form start -->

                                <div class="card-body">
                                    <form action="planomensalidadeservlet" method="POST">
                                        <div class="row">
                                            <div class="col-3">
                                                <label>Código:</label>
                                                <input  type="text" class="form-control" name="codigo_consulta" id="codigo_consulta" placeholder="Código" >
                                            </div>
                                            <div class="col-9">
                                                <label>Descrição:</label>
                                                <input type="text"  class="form-control" name="descricao_consulta" id="descricao_consulta" placeholder="Descrição">
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="col-3">
                                                <label>Status:</label> 
                                                <select type="text" name="status_consulta" id="status_consulta" class="form-control">
                                                    <%
                                                        out.println("<option>Todos</option>");
                                                        out.println("<option>" + StatusEnum.Ativo.toString() + "</option>");
                                                        out.println("<option>" + StatusEnum.Inativo.toString() + "</option>");
                                                    %>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="col-9">
                                            </div>
                                            <div class="col-3">
                                                <input type="hidden" name="ope" value="buscar_plano_mensalidade">    
                                                <button type="submit" class="btn btn-block btn-primary">Buscar</button>
                                            </div>
                                        </div>
                                    </form>

                                    <div class="row">
                                        <div class="card-body">
                                            <table id="example2"  class="table table-bordered table-hover">
                                                <thead>
                                                    <tr>
                                                        <th>Código</th>
                                                        <th>Descrição</th>
                                                        <th>Valor</th>
                                                        <th>Vencimento</th>
                                                        <th>Periodicidade</th>
                                                        <th>Status</th>
                                                    </tr>
                                                </thead>
                                                <tbody>                                                                                           
                                                    <%
                                                        for (int i = 0; i < lista_plano_mensalidade.size(); i++) {
                                                            PlanoMensalidadeBean p = (PlanoMensalidadeBean) lista_plano_mensalidade.get(i);

                                                            String status = "";
                                                            if (p.isAtivo()) {
                                                                status = "Ativo";
                                                            } else {
                                                                status = "Inativo";
                                                            }

                                                            Locale ptBr = new Locale("pt", "BR");
                                                            String valor = NumberFormat.getCurrencyInstance(ptBr).format(p.getValor());

                                                            out.println("<tr><td>" + p.getCodigo() + "</td><td>" + p.getDescricao() + "</td>"
                                                                    + "<td>" + valor + "</td><td>" + p.getDia_vencimento() + "</td>"
                                                                    + "<td>" + p.getPeriodicidade() + "</td><td>" + status + "</td></tr>");
                                                        }
                                                    %>
                                                </tbody>
                                            </table>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-3">
                                            <button type="button" id="editar" name ="editar" class="btn btn-block btn-warning">Editar</button>
                                        </div>
                                        <div class="col-6">
                                        </div>
                                        <div class="col-3">
                                            <form name="excluir" action="planomensalidadeservlet" method="POST">
                                                <input type="hidden" id="codigo_excluir" name="codigo_excluir">
                                                <input type="hidden" name="ope" value="excluir_plano_mensalidade">
                                                <input type=button class="btn btn-block btn-danger" onclick="confirmExclusao()" value="Excluir">
                                            </form>
                                        </div>
                                    </div>
                                </div>
                                <!-- /.card-body -->
                            </div>
                        </div><!-- /.container-fluid -->
                    </div>
                </section>
            </div>
            <!-- /.content-wrapper -->
            <footer class="main-footer">
                <%@include  file="pages/footer.html" %>
            </footer>
            <!-- Control Sidebar -->
            <aside class="control-sidebar control-sidebar-dark">
                <!-- Control sidebar content goes here -->
            </aside>
            <!-- /.control-sidebar -->
        </div>
        <script>
            
            function Mensagem(){
                if(<%= !mensagem.toString().equals("")%>)
                    bootbox.alert("<%= mensagem%>");  
            }
            
            var tabela = document.getElementById("example2");
            var linhas = tabela.getElementsByTagName("tr");

            for(var i = 0; i < linhas.length; i++){
                    var linha = linhas[i];
              linha.addEventListener("click", function(){
                    //Adicionar ao atual
                            selLinha(this, false); //Selecione apenas um
                                            //selLinha(this, true); //Selecione quantos quiser
                    });
            }
            /**
            Caso passe true, você pode selecionar multiplas linhas.
            Caso passe false, você só pode selecionar uma linha por vez.
            **/
            function selLinha(linha, multiplos){
              if(!multiplos){
                    var linhas = linha.parentElement.getElementsByTagName("tr");
                            for(var i = 0; i < linhas.length; i++){
                               var linha_ = linhas[i];
                               linha_.classList.remove("selecionado");    
                            }
              }
              linha.classList.toggle("selecionado");
              
              var selecionados = tabela.getElementsByClassName("selecionado");
              for(var i = 0; i < selecionados.length; i++){
                    var selecionado = selecionados[i];
                    selecionado = selecionado.getElementsByTagName("td");
                    
                    document.getElementById('codigo_excluir').value = selecionado[0].innerHTML;
               }
            }
            /**
            Exemplo de como capturar os dados
            **/
            var btnVisualizar = document.getElementById("editar");

            btnVisualizar.addEventListener("click", function(){
                    var selecionados = tabela.getElementsByClassName("selecionado");
              //Verificar se eestá selecionado
              if(selecionados.length < 1){
                    alert("Selecione pelo menos uma linha");
                    return false;
              }
              
              
              var dados = "";
              for(var i = 0; i < selecionados.length; i++){
                    var selecionado = selecionados[i];
                    selecionado = selecionado.getElementsByTagName("td");
                    //dados += "ID: " + selecionado[0].innerHTML + " - Nome: " + selecionado[1].innerHTML + " - Idade: " + selecionado[2].innerHTML +" - Idade: " + selecionado[3].innerHTML + " - Idade: " + selecionado[4].innerHTML + " - Idade: " + selecionado[5].innerHTML + "\n";
                    
                    document.getElementById('codigo').value = selecionado[0].innerHTML;
                    document.getElementById('descricao').value = selecionado[1].innerHTML;
                    document.getElementById('valor').value = selecionado[2].innerHTML.replace("R$ ", "");
                    document.getElementById('dia_vencimento').value = selecionado[3].innerHTML;
                    document.getElementById('periodicidade').value = selecionado[4].innerHTML;
                    document.getElementById('status').value = selecionado[5].innerHTML;
                    //codigo = selecionado[0].innerHTML
                    //nome = selecionado[1].innerHTML 
                    //idade = selecionado[2].innerHTML 

              }

              //alert(dados);
              
            });
            
            function confirmExclusao(){ 
                bootbox.confirm("Tem certeza que deseja excluir este registro?", function(resposta){
                    if(resposta == true){
                        document.excluir.submit()  
                    }
                });
                //if (confirm('Tem certeza que deseja excluir este registro?')){ 
                  //  document.excluir.submit() 
                //} 
            }  
            /*function confirmCancelar() {
                if (confirm("Tem certeza que deseja excluir essa categoria?")) {
                    location.href="deletar_categoria.jsp?acao=deletar";
                }
            }*/
            
            
        </script>
        <!-- bootbox -->
        <script src="plugins/custom/bootbox.min.js"></script>
        <!-- jQuery -->
        <script src="plugins/jquery/jquery.min.js"></script>
        <!-- jQuery UI 1.11.4 -->
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.min.js"></script>
        <!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
        <script>
                                                           $.widget.bridge('uibutton', $.ui.button)
        </script>
        <!-- Bootstrap 4 -->
        <script src="plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
        <!-- DataTables -->
        <script src="../../plugins/datatables/jquery.dataTables.min.js"></script>
        <script src="../../plugins/datatables/dataTables.bootstrap4.min.js"></script>
        <!-- Morris.js charts -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js"></script>
        <script src="plugins/morris/morris.min.js"></script>
        <!-- Sparkline -->
        <script src="plugins/sparkline/jquery.sparkline.min.js"></script>
        <!-- jvectormap -->
        <script src="plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
        <script src="plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
        <!-- jQuery Knob Chart -->
        <script src="plugins/knob/jquery.knob.js"></script>
        <!-- daterangepicker -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.10.2/moment.min.js"></script>
        <script src="plugins/daterangepicker/daterangepicker.js"></script>
        <!-- datepicker -->
        <script src="plugins/datepicker/bootstrap-datepicker.js"></script>
        <!-- Bootstrap WYSIHTML5 -->
        <script src="plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
        <!-- Slimscroll -->
        <script src="plugins/slimScroll/jquery.slimscroll.min.js"></script>
        <!-- FastClick -->
        <script src="plugins/fastclick/fastclick.js"></script>
        <!-- AdminLTE App -->
        <script src="dist/js/adminlte.js"></script>
        <!-- AdminLTE dashboard demo (This is only for demo purposes) -->
        <script src="dist/js/pages/dashboard.js"></script>
        <!-- AdminLTE for demo purposes -->
        <script src="dist/js/demo.js"></script>

    </body>
</html>
