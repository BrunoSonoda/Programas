import pygame
import random
import os

print('Quer escolher a música? ')
escolha = int(input('0-Não  1-Sim'))

while (escolha > 1 or escolha < 0):

    print('Insira um número válido: ')
    escolha = int(input('0-Não  1-Sim'))

if (escolha==0):

    pygame.init()
    file = random.choice(os.listdir('Music'))
    conc = 'Music/' + file
    pygame.mixer.music.load(conc)
    pygame.mixer.music.play()
    pygame.event.wait()

elif (escolha==1):

    print('Escolha um número: ')
    print('1 - Aerials\n2 - Alive\n3 - All Along the Watchtower\n4 - Barracuda\n5 - Black Betty')
    print('6 - Bring Me To Life\n7 - Bullet With Butterfly Wings')
    escolha = int(input())

    if (escolha==1):

        pygame.init()
        pygame.mixer.music.load('Music\Aerials.mp3')
        pygame.mixer.music.play()
        pygame.event.wait()

    elif (escolha==2):

        pygame.init()
        pygame.mixer.music.load('Music\Alive - Pearl Jam.mp3')
        pygame.mixer.music.play()
        pygame.event.wait()

    elif (escolha==3):

        pygame.init()
        pygame.mixer.music.load('Music\All Along the Watchtower - Jimi Hendrix.mp3')
        pygame.mixer.music.play()
        pygame.event.wait()

    elif (escolha==4):

        pygame.init()
        pygame.mixer.music.load('Music\Barracuda - Heart.mp3')
        pygame.mixer.music.play()
        pygame.event.wait()

    elif (escolha==5):

        pygame.init()
        pygame.mixer.music.load('Music\Black Betty - Ram Jam.mp3')
        pygame.mixer.music.play()
        pygame.event.wait()

    elif (escolha==6):

        pygame.init()
        pygame.mixer.music.load('Music\Bring Me To Life - Evanescence.mp3')
        pygame.mixer.music.play()
        pygame.event.wait()

    elif (escolha==7):

        pygame.init()
        pygame.mixer.music.load('Music\Bullet With Butterfly Wings - Remastered 2012 - The Smashing Pumpkins.mp3')
        pygame.mixer.music.play()
        pygame.event.wait()

    else :

        print('Erro: O número não tem correspondencia')
