# Lumen Architecture

## Overview

Lumen is designed as a centralized AI simulation responsible for managing adaptive NPC behavior within a Minecraft environment.

Rather than assigning a separate AI model to every NPC, Lumen maintains a shared simulation and provides individual NPCs with unique behavioral states.

## NPC Processing

Each NPC maintains a collection of attributes including:

- Personality
- Memory
- Relationships
- Current goals
- Environmental awareness
- Behavioral state

These attributes are processed by Lumen to determine how an NPC responds to its surroundings.

## Shared Simulation

Lumen maintains a shared understanding of the simulated environment.

NPCs can:

- Observe environmental changes
- Interact with other NPCs
- Remember previous interactions
- Develop relationships
- Modify their behavior based on previous experiences

## Development Status

The architecture is experimental and subject to significant changes during development.
