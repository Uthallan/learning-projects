import sys
import pygame
import os


# SETTINGS
RESOLUTION = [WIDTH:=800, HEIGHT:=600]
bg_color = (WHITE:=(255, 255, 255))

# ASSETS

def draw_screen():
    # Sets the screen resolution (HEIGHT, WIDTH)
    screen = pygame.display.set_mode((WIDTH, HEIGHT))
    # Changes display name of program on top right of window
    pygame.display.set_caption("Blackjack")
    # Set the background color
    # Redraw the screen for each pass through the loop
    screen.fill(bg_color)

    
    # Make the most recently drawn screen visable
    pygame.display.flip()

def run_game():
    # Defines a clock to keep framerate
    clock = pygame.time.Clock()
    # Initializes the game and created a screen object
    pygame.init()
    draw_screen()

    # Start main loop of the game
    while True:

        # Sets FPS
        clock.tick(FPS:=60)

        # Watch for keyboard and mouse events
        for event in pygame.event.get():
            # Watches for QUIT event and quits program when detected
            if event.type == pygame.QUIT:
                sys.exit()
        
        

run_game()