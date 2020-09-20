export type GamePLatform = 'XBOX' | 'PC' | 'PLAYSTATION';

export type Game = {
    id: number,
    title: string,
    platform: GamePLatform;
    label: string;
    value: number;
}