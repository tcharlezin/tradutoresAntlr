@extends('layouts.app')

@section('content')

    <div class="container">
        <h3>Listagem de %%MODEL%%</h3>

        <a href="{{ route('%%MODEL_CREATE%%') }}" class="btn btn-default">Adicionar %%MODEL%%</a>
        <br>

        <table class="table table-bordered">
            <thead>
            <tr>
                <th>ID</th>
                %%CAMPOS_HEADER%%
                <th>Acao</th>
            </tr>
            </thead>
            <tbody>
            @foreach($dados as $dado)
            <tr>
                <td>{{ $dado->id }}</td>
                %%CAMPOS_BODY%%
                <td>
                    <a href="{{ route('%%MODEL_EDIT%%', ['id'=> $dado->id]) }}" class="btn btn-default btn-sm">
                        Editar
                    </a>
                    <a href="#" class="btn btn-default btn-sm">
                        Excluir
                    </a>
                </td>
            </tr>
            @endforeach
            </tbody>
        </table>

        {!! $dados->render() !!}

    </div>

@endsection