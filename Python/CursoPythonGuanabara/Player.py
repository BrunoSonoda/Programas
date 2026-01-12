import pygame
import random
import os

# Inicializar o pygame
pygame.init()

# Listar as músicas
musicas = [f for f in os.listdir('Music') if f.endswith('.mp3')]
if not musicas:
    print("Nenhuma música encontrada na pasta 'Music'.")
    exit()

# Criar a fila de músicas
random.shuffle(musicas)
fila_de_musicas = iter(musicas)

# Evento para quando a música termina
FIM_MUSICA = pygame.USEREVENT + 1
pygame.mixer.music.set_endevent(FIM_MUSICA)

# Carregar e tocar a primeira música
try:
    proxima_musica = next(fila_de_musicas)
    pygame.mixer.music.load(os.path.join('Music', proxima_musica))
    pygame.mixer.music.play()
    print(f"Tocando: {proxima_musica}")
except StopIteration:
    print("A fila de músicas está vazia.")
    exit()

is_paused = False
running = True
while running:
    # Capturar eventos
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False

        # Verifica se a música terminou
        if event.type == FIM_MUSICA:
            try:
                proxima_musica = next(fila_de_musicas)
                pygame.mixer.music.load(os.path.join('Music', proxima_musica))
                pygame.mixer.music.play()
                print(f"Tocando: {proxima_musica}")
            except StopIteration:
                print("Fim da lista de reprodução.")
                running = False
                break

    # Capturar entrada do usuário
    comando = input("Comandos: (P)ausar/Retomar, (S)kip, (R)ebobinar, (Q)uit ")
    comando = comando.lower()

    if comando == 'p':
        if is_paused:
            pygame.mixer.music.unpause()
            is_paused = False
            print("Retomando música...")
        else:
            pygame.mixer.music.pause()
            is_paused = True
            print("Música pausada.")
    elif comando == 's':
        pygame.mixer.music.stop()
        print("Pulando para a próxima música...")
    elif comando == 'r':
        pygame.mixer.music.rewind()
        print("Voltando música para o início.")
    elif comando == 'q':
        running = False

pygame.quit()
