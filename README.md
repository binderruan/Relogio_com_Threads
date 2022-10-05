# Relogio_com_Threads
Trabalho da disciplina de Sistemas Operacionais, Análise e Desenvolvimento de Sistemas - IFSC

# Desenvolver um relógio com cronômetro e alarme utilizando Threads
#O programa deve utilizar pelo menos 4 Threads:
# Thread principal:
◦ Menu, com opções:
▪ Ajustar horário;
▪ Visualizar horário;
▪ Iniciar cronômetro;
▪ Parar cronômetro (e mostrar valor atual);
▪ Zerar cronômetro;
▪ Definir alarme;
# Thread relógio:
◦ Faz a passagem do tempo, 1 segundo por vez;
# Thread cronômetro:
◦ Marca o tempo entre o iniciar cronômetro e o parar cronômetro (caso o cronômetro seja
iniciado, parado e iniciado novamente, quando ele é iniciado pela segunda vez ele
continua do valor anterior, não reinicia do zero);
# Thread alarme:
◦ Verifica se o horário atual é igual ao horário em que o alarme está programado, se for
avisa o usuário;
