import sys
import pygame
import os


# SETTINGS
RESOLUTION = [WIDTH:=800, HEIGHT:=600]
bg_color = (WHITE:=(255, 255, 255))

# ASSETS
SPACESHIP_IMAGE = pygame.image.load(os.path.join('resources', 'Assets', 'SHIP.png'))
SPACESHIP = pygame.transform.rotate(pygame.transform.scale(SPACESHIP_IMAGE, (55,40)), -90)

def draw_screen():
    # Sets the screen resolution (HEIGHT, WIDTH)
    screen = pygame.display.set_mode((WIDTH, HEIGHT))
    # Changes display name of program on top right of window
    pygame.display.set_caption("Goddamn Alien Invasion")
    # Set the background color
    # Redraw the screen for each pass through the loop
    screen.fill(bg_color)
    # Draw ships to screen ( [0,0] coordinates start top right, not center)
    screen.blit(SPACESHIP, (200,200))

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